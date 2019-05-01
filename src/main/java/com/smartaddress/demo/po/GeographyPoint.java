package com.smartaddress.demo.po;

public class GeographyPoint {
    /**
     * 名称
     */
    String   name;
    /**
     * 物理地址
     */
    String address;
    /**
     * 商业类型， 例如学校，写字楼
     */
    String  type;
    /**
     * shape中心经度
     */
    Double longitude;
    /**
     * shape中心纬度
     */
    Double latitude;

    /**
     * 形状类型 圆形 椭圆形 多边形 线
     */
    String shapeType;

    /**
     * 形状数据，不同形状的数据结构不一样
     */
    String JsonData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public String getJsonData() {
        return JsonData;
    }

    public void setJsonData(String jsonData) {
        JsonData = jsonData;
    }
}
