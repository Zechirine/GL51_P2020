package gl51.service.picture

import gl51.data.picture.Picture

interface DimPictureService {
    /*
    cette methode redimentionne une image donnée
     */
    Picture dimPicture(Picture picture)
}