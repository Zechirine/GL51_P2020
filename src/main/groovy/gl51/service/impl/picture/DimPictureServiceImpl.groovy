package gl51.service.impl.picture

import gl51.data.picture.Picture

class DimPictureServiceImpl implements gl51.service.picture.DimPictureService {
    @Override
    Picture dimPicture(Picture picture) {
        picture.setlarge(1024)
        picture.setHeight(1024)
        return picture
    }
}
