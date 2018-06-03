package com.ubuyquick.customer.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.ubuyquick.customer.R;
import com.ubuyquick.customer.model.Shop;
import com.ubuyquick.customer.utils.UniversalImageLoader;

import java.util.ArrayList;
import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder> {

    private static final String TAG = "ShopAdapter";

    private Context context;
    private List<Shop> shops;

    public ShopAdapter(Context context) {
        this.context = context;
        this.shops = new ArrayList<>();
        ImageLoader.getInstance().init(new UniversalImageLoader(context).getConfig());
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_shop_name;
        private TextView tv_shop_status;
        private ImageView img_shop;
        private TextView tv_shop_timings;
        private TextView tv_shop_address;

        public ViewHolder(final View itemView) {
            super(itemView);

            this.tv_shop_name = (TextView) itemView.findViewById(R.id.tv_shop_name);
            this.tv_shop_status = (TextView) itemView.findViewById(R.id.tv_shop_status);
            this.tv_shop_timings = (TextView) itemView.findViewById(R.id.tv_shop_timings);
            this.tv_shop_address = (TextView) itemView.findViewById(R.id.tv_shop_location);
            this.img_shop = (ImageView) itemView.findViewById(R.id.img_shop) ;

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (getAdapterPosition() != RecyclerView.NO_POSITION) {
                        Shop clickedShop = shops.get(getAdapterPosition());

                    }
                }
            });

        }


        public void bind(Shop shop) {
            UniversalImageLoader.setImage(shop.getShopImageUrl(), this.img_shop);
            tv_shop_name.setText(shop.getShopName());
            tv_shop_timings.setText(shop.getShopTimings());
            tv_shop_status.setText(shop.getStatus());
            tv_shop_address.setText(shop.getShopAddress());
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(this.context).inflate(R.layout.card_shop, parent, false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(this.shops.get(position));
    }

    @Override
    public int getItemCount() {
        return shops.size();
    }
}