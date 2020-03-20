package gl51.service.impl.picture

import gl51.data.picture.Picture
import gl51.service.picture.DimPictureService
import gl51.service.picture.MajBDService
import gl51.service.picture.StoreService
import gl51.service.picture.ThumbnailService

import javax.inject.Inject

class RemotePictureServiceImpl implements gl51.service.picture.RemotePictureService {
    @Inject
    DimPictureService dimPictureService

    @Inject
    ThumbnailService thumbnailService

    @Inject
    StoreService storeService

    @Inject
    MajBDService majBDService

    @Override
    Boolean remotePicture() {
        Picture picture = dimPictureService.dimPicture()
        Picture thumbnail = thumbnailService.thumbnail(picture)
        String addrPicture = storeService.store(picture, thumbnail)
        Boolean majBD = majBDService(addrPicture, picture.getNamePicture())
        return majBD
    }
}
