package com.kalsym.parentwrapper.configs;


public class SwaggerConfigParent {

    private String basePackage;
    private String infoBuilderTitle;
    private String infoBuilderDescription;
    private String termsOfServiceUrl;
    private String infoBuilderLicense;
    private String licenseUrl;
    private String version;

    public SwaggerConfigParent(String basePackage, String infoBuilderTitle, String infoBuilderDescription, String termsOfServiceUrl, String infoBuilderLicense, String licenseUrl, String version) {
        this.basePackage = basePackage;
        this.infoBuilderTitle = infoBuilderTitle;
        this.infoBuilderDescription = infoBuilderDescription;
        this.termsOfServiceUrl = termsOfServiceUrl;
        this.infoBuilderLicense = infoBuilderLicense;
        this.licenseUrl = licenseUrl;
        this.version = version;
    }

    public SwaggerConfigParent() {
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getInfoBuilderTitle() {
        return infoBuilderTitle;
    }

    public void setInfoBuilderTitle(String infoBuilderTitle) {
        this.infoBuilderTitle = infoBuilderTitle;
    }

    public String getInfoBuilderDescription() {
        return infoBuilderDescription;
    }

    public void setInfoBuilderDescription(String infoBuilderDescription) {
        this.infoBuilderDescription = infoBuilderDescription;
    }

    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public String getInfoBuilderLicense() {
        return infoBuilderLicense;
    }

    public void setInfoBuilderLicense(String infoBuilderLicense) {
        this.infoBuilderLicense = infoBuilderLicense;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
