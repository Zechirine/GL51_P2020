package gl51.service.impl

import gl51.data.ip.Ip
import gl51.service.ip.IpService
import gl51.service.ip.IpConverterService
import javax.inject.Inject

class BinaryConverterServiceImpl implements gl51.service.ip.IpConverterService {
    /**
     * convertit une IP en string
     * @param ip l'ip a convertir
     * @return
     */
    @Inject
    IpService service

    @Override
    String getAndConvertIp() {
        Ip ip = service.fetchIp()
        ///
    }
}
