package dh.dev.workfromhere.spaces.service;

import dh.dev.workfromhere.exceptions.ErrorCode;
import dh.dev.workfromhere.spaces.exception.SpaceResourceException;
import dh.dev.workfromhere.spaces.model.SpaceResource;
import dh.dev.workfromhere.spaces.repository.SpaceResourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceResourceService {
    private final SpaceResourceRepository spaceResourceRepository;

    public SpaceResourceService(SpaceResourceRepository spaceResourceRepository) {
        this.spaceResourceRepository = spaceResourceRepository;
    }

    public List<SpaceResource> getAllSpaces() {
        return spaceResourceRepository.findAll();
    }

    public SpaceResource getSpaceById(Integer id) {
        return spaceResourceRepository.findById(id).orElseThrow(
                () -> new SpaceResourceException(ErrorCode.SPACE_NOT_FOUND)
        );
    }

    public SpaceResource createSpace(SpaceResource spaceResource) {
        return spaceResourceRepository.save(spaceResource);
    }

    public void updateSpace(Integer id, SpaceResource spaceResource) {
        SpaceResource spaceResourceToUpdate = spaceResourceRepository.findById(id).orElseThrow(
                () -> new SpaceResourceException(ErrorCode.SPACE_NOT_FOUND)
        );

        if (spaceResourceToUpdate != null) {
            spaceResourceToUpdate.setName(spaceResource.getName());
            spaceResourceToUpdate.setDescription(spaceResource.getDescription());
            spaceResourceToUpdate.setType(spaceResource.getType());
            spaceResourceToUpdate.setWifiAvailable(spaceResource.getWifiAvailable());
            spaceResourceToUpdate.setWifiPassword(spaceResource.getWifiPassword());

            spaceResourceRepository.save(spaceResourceToUpdate);
        }
    }

    public void deleteSpaceById(Integer id) {
        SpaceResource spaceResourceToDelete = spaceResourceRepository.findById(id).orElseThrow(
                () -> new SpaceResourceException(ErrorCode.SPACE_NOT_FOUND)
        );

        if (spaceResourceToDelete != null) {
            spaceResourceRepository.delete(spaceResourceToDelete);
        }
    }
}
