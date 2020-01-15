 class Location1  {
    private String LocationName;
    private String  zipcode;

    public Location1(String LocationName, String  zipcode){
        this.LocationName = LocationName;
        this.zipcode = zipcode;

     }

     public String getLocationName() {
         return LocationName;
     }

     public void setLocationName(String locationName) {
         LocationName = locationName;
     }

     public String getZipcode() {
         return zipcode;
     }

     public void setZipcode(String zipcode) {
         this.zipcode = zipcode;
     }



     public String toString() {
         return super.toString();
     }


 }
