package spring.simulatingoperationdohs.modelClass;

public class Property {
        private String propertyName;
        private String address;
        private int price;


        // Default constructor
        public Property() {
        }

        public Property(String propertyName, String address, int price) {
            this.propertyName = propertyName;
            this.address = address;
            this.price = price;
        }
        public String getPropertyName() {
            return propertyName;
        }
        public void setPropertyName(String propertyName) {
            this.propertyName = propertyName;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        @Override
        public String toString() {
            return "Property{" +
                    "propertyName='" + propertyName + '\'' +
                    ", address='" + address + '\'' +
                    ", price=" + price +
                    '}';
        }
}
