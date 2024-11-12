package qwer.maquina.de.turin.modules.MaquinaDeTurin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qwer.maquina.de.turin.modules.MaquinaDeTurin.models.DTOMaquinaDeTurin;
import qwer.maquina.de.turin.modules.MaquinaDeTurin.services.MaquinaDeTurin;

@RestController
@RequestMapping("/api/maquinaDeTurin")
public class controller {

    @Autowired
    private MaquinaDeTurin maquinaDeTurin;

    @PostMapping("/encrypt")
    public String encrypt(@RequestBody DTOMaquinaDeTurin request) {
        return maquinaDeTurin.encrypt(request.getText(), request.getShift());
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestBody DTOMaquinaDeTurin request) {
        return maquinaDeTurin.decrypt(request.getText(), request.getShift());
    }

}
