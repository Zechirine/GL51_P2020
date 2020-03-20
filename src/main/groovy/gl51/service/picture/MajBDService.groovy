package gl51.service.picture

interface MajBDService {
    /*
    cette methode prend l'addresse et le nom de l'image
    afin de Mettre à Jour la BD
     */
    Boolean majBD(String addrPicture, String namePicture)
}