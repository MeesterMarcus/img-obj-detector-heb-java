package com.marcuslorenzana.imageobjectdetector.models;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class ImageMetadataRequest {
    @NotNull
    String imageSource;
    @Min(1)
    @Max(120)
    String label;
    Boolean enableObjectDetection;
    Boolean dryRun;

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getEnableObjectDetection() {
        return enableObjectDetection;
    }

    public void setEnableObjectDetection(Boolean enableObjectDetection) {
        this.enableObjectDetection = enableObjectDetection;
    }

    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public String toString() {
        return "ImageMetadata{" +
                "imageSource='" + imageSource + '\'' +
                ", label='" + label + '\'' +
                ", enableObjectDetection=" + enableObjectDetection +
                ", dryRun=" + dryRun +
                '}';
    }
}
