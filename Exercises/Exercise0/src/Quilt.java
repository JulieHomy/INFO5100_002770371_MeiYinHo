public class Quilt {
    private String name;
    private String material;
    private String size;
    private String color;
    private boolean isWashable;
    private int price;
    private String pattern;
    private int thickness;

    public Quilt(String name, String material, String size, String color, boolean isWashable, int price, String pattern, int thickness) {
        this.name = name;
        this.material = material;
        this.size = size;
        this.color = color;
        this.isWashable = isWashable;
        this.price = price;
        this.pattern = pattern;
        this.thickness = thickness;
        System.out.println("New quilt created with name " + name);
    }

    public String getName() {
        return name;
    }

    public void wash() {
        if (isWashable) {
            System.out.println("Washing quilt " + name);
        } else {
            System.out.println("Quilt " + name + " is not washable");
        }
    }

    public void fold() {
        System.out.println("Folding quilt " + name);
    }

    public class Label {
        private String brand;
        private String careInstructions;

        public Label(String brand, String careInstructions) {
            this.brand = brand;
            this.careInstructions = careInstructions;
            System.out.println("New label created for quilt " + name);
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getCareInstructions() {
            return careInstructions;
        }

        public void setCareInstructions(String careInstructions) {
            this.careInstructions = careInstructions;
        }
    }

    public static class Review {
        private String reviewerName;
        private int rating;
        private String comment;

        public Review(String reviewerName, int rating, String comment) {
            this.reviewerName = reviewerName;
            this.rating = rating;
            this.comment = comment;
            System.out.println("New review created by " + reviewerName);
        }

        public String getReviewerName() {
            return reviewerName;
        }

        public void setReviewerName(String reviewerName) {
            this.reviewerName = reviewerName;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
    }

    public static void main(String[] args) {
        Quilt quilt1 = new Quilt("Floral Quilt", "Cotton", "Queen", "Green", true, 150, "Floral", 2);
        Quilt quilt2 = new Quilt("Patchwork Quilt", "Polyester", "Full", "Blue", false, 100, "Patchwork", 1);
        Quilt quilt3 = new Quilt("Striped Quilt", "Silk", "King", "Red", true, 200, "Striped", 3);

        Quilt.Label label1 = quilt1.new Label("Quilts R Us", "Machine wash cold, tumble dry low");
        Quilt.Label label2 = quilt2.new Label("Quilt Co.", "Spot clean only");
        Quilt.Label label3 = quilt3.new Label("Quilt Emporium", "Dry clean only");

        Quilt.Review review1 = new Quilt.Review("Jane Doe", 4, "This quilt is beautiful and cozy!");
        Quilt.Review review2 = new Quilt.Review("John Smith", 3, "It's a bit thin, but still nice.");
        Quilt.Review review3 = new Quilt.Review("Alice Johnson", 5, "I love this quilt so much!");

        System.out.println(quilt1.getName() + " has a brand label from " + label1.getBrand());
        System.out.println(quilt2.getName() + " has a care label that says " + label2.getCareInstructions());
        System.out.println(quilt3.getName() + " has " + review3.getRating() + " stars from a reviewer named " + review3.getReviewerName());
    }
}


