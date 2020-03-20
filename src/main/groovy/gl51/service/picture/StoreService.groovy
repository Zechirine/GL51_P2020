package gl51.service.picture

import gl51.data.picture.Picture

interface StoreService {
    /*
    cette methode va prendre les deux images en paramètres
    et stocker dans le cloud
     */
    String store(Picture picture, Picture thumbnail)
}