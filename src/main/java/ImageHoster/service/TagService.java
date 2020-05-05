package ImageHoster.service;

import ImageHoster.model.Tag;
import ImageHoster.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TagService {
    @Autowired
    private TagRepository tagRepository;
//hhakf
    public Tag getTagByName(String title) {
        return tagRepository.findTag(title);
    }
//dsfdas
    public Tag createTag(Tag tag) {
        return tagRepository.createTag(tag);
    }
}
