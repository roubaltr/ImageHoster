package ImageHoster.service;

import ImageHoster.model.Image;
import ImageHoster.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    //Call the getAllImages() method in the Repository and obtain a List of all the images in the database

    public List<Image> getAllImages() {
        return imageRepository.getAllImages();
    }


    //The method calls the createImage() method in the Repository and passes the image to be persisted in the database
    public Image createImage(Image image) {
        Image image2 = imageRepository.uploadImage(image);
        return image2;
    }

    //The method calls the getImageByTitle() method in the Repository and passes the title of the image to be fetched

    public Image getImageByTitle(String title) {
        Image image3 = imageRepository.getImageByTitle(title);
        return image3;
    }

    //The method calls the getImage() method in the Repository and passes the id of the image to be fetched

    public Image getImage(Integer id) {
        Image image4 = imageRepository.getImage(id);
        return image4;
    }

    //The method calls the updateImage() method in the Repository and passes the Image to be updated in the database

// the method calls the updateImage() which is used for evrything
    //The method calls the deleteImage() method in the Repository and passes the Image id of the image to be deleted in the database

    public void deleteImage(Integer id) {
        imageRepository.deleteImage(id);

    }

    public List<Image> getImageByUserId(Integer userId){
        List<Image> imageByUserId1  = imageRepository.getImageByUserId(userId);
        return imageByUserId1;
    }

    public Image uploadImage(Image newImage) {
        Image image5 = imageRepository.uploadImage(newImage);
        return image5;
    }

    public void updateImage(Image updatedImage) {
        imageRepository.updateImage(updatedImage);
    }
}
