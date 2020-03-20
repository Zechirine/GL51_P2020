package gl51.service.impl.picture

import gl51.data.picture.Picture

class ThumbnailServiceImpl implements gl51.service.picture.ThumbnailService {

    @Override
    Picture thumbnail(Picture picture) {
        picture.setlarge(500)
        picture.setheight(500)
        return picture
    }
}
