package in.bushansirgur.foodiesapi.io;


public class FoodResponse {
    private String id;
    private String name;
    private String description;
    private String imageUrl;
    private double price;
    private String category;

    public FoodResponse(String id, String name, String description, String imageUrl, double price, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.category = category;
    }

    public FoodResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private FoodResponse(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.imageUrl = builder.imageUrl;
        this.price = builder.price;
        this.category = builder.category;
    }

    public static class Builder {
        private String id;
        private String name;
        private String description;
        private String imageUrl;
        private double price;
        private String category;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public FoodResponse build() {
            return new FoodResponse(this);
        }
    }
}
