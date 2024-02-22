package com.HealthCare.SystemApplication.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HealthCare.SystemApplication.repository.UserRepo;
import com.HealthCare.SystemApplication.service.AppointmentService;
import com.HealthCare.SystemApplication.service.implementation.AppointmentServiceImp;
@RestController
@CrossOrigin
@RequestMapping("permission")
public class PermissionController {

    
    @Autowired
    UserRepo userRepo;

    @PreAuthorize("hasRole('PATIENT') or hasRole('RECEPTIONIST') or hasRole('ADMIN') or hasRole('DOCTOR')")
    @GetMapping("/getPermissions/{role}")
    public ResponseEntity<?> getPermissions(@PathVariable String role) {
            String[] patientPermission={"appointment_edit", "appointment_delete", "appointment_create","doctor_book","view_appointment"};
            String[] doctorPermission={"appointment_edit", "appointment_delete", "appointment_create","view_appointment"};
            String[] adminPermission={"appointment_edit", "appointment_delete","view_appointment"};
            if (role.equals("PATIENT"))  {
                return new ResponseEntity<String[]>(patientPermission, HttpStatus.OK);
            }
            else
            if (role.equals("DOCTOR") )  {
                return new ResponseEntity<String[]>(doctorPermission, HttpStatus.OK);
            }
            else if (role.equals("ADMIN"))  {
                return new ResponseEntity<String[]>(adminPermission, HttpStatus.OK);
            }
            else
                return new ResponseEntity<String[]>(patientPermission, HttpStatus.OK);
    }
}
