package geolocator;

public record GeoLocation (String as, String city, String country, String countryCode, String isp,
        double lat, double lon, String org, String query, String region, String regionName,
        String timezone, String zip) {
        public GeoLocation(String as, String city, String country, String countryCode, String isp,
                       double lat, double lon, String org, String query, String region, String regionName,
                       String timezone, String zip){
                        this.as = as;
                        this.city = city;
                        this.country = country;
                        this.countryCode = countryCode;
                        this.isp = isp;
                        this.lat = lat;
                        this.lon = lon;
                        this.org = org;
                        this.query = query;
                        this.region = region;
                        this.regionName = regionName;
                        this.timezone = timezone;
                        this.zip = zip;
                        }

        public static void main(String[] args){
            var GeoSet = new GeoLocation("AS6830 Liberty Global B.V.", "Budapest", "Hungary",
                    "HU", "Liberty Global B.V.", 47.5636, 19.0947, "Vodafone Hungary Ltd", "176.63.8.16",
                    "BU", "Budapest", "Europe/Budapest", "1132");

            System.out.println(GeoSet);
        }
}








