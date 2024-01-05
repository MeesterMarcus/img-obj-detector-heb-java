package com.marcuslorenzana.imageobjectdetector.controllers;

import com.marcuslorenzana.imageobjectdetector.entities.ImageMetadataEntity;
import com.marcuslorenzana.imageobjectdetector.models.ImageMetadataRequest;
import com.marcuslorenzana.imageobjectdetector.services.ImageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/image")
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping()
    public List<ImageMetadataEntity> getAllImages(@RequestParam(value="objects", required = false) String objects) {
        return this.imageService.getAllImages(objects);
    }

    @GetMapping("{id}")
    public ImageMetadataEntity getImageById(@PathVariable("id") Long itemId) {
        return this.imageService.getImageById(itemId);
    }

    @PostMapping()
    public ImageMetadataEntity createImage(@RequestBody ImageMetadataRequest image) {
        return this.imageService.createImage(image);
    }
}
