package com.xworkz.monitor.component;

import com.xworkz.monitor.dto.CameraDTO;
import com.xworkz.monitor.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CameraComponent {

    public CameraComponent() {
        System.out.println("camera component is created");
    }
    @Autowired
    private CameraService cameraService;

    @RequestMapping("/camera")
    public String camera(CameraDTO cameraDTO, Model model) {

        System.out.println("running camera in camera component");
        System.out.println("cameraDTO: " + cameraDTO);

        model.addAttribute("message", "Camera details saved");
        this.cameraService.validateAndSave(cameraDTO);

        return "/camera.jsp";
    }
}