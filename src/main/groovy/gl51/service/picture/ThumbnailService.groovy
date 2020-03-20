package gl51.service.picture

import gl51.data.picture.Picture

interface ThumbnailService {
    /*cette methode permet de générer le thumbnail à travers le logo
    qui pour nous est 'picture'
     */
    Picture thumbnail(Picture picture)
}