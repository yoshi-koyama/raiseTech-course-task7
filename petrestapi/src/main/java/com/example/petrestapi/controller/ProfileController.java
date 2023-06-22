package com.example.petrestapi.controller;

import com.example.petrestapi.form.ProfileCreateForm;
import com.example.petrestapi.form.ProfileUpdateForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class ProfileController {

    @GetMapping("/profile")
    public List<String> getProfile() {
        return List.of("ALBA", "VANILLA");
    }

    @PostMapping("/profile")
    public ResponseEntity<String> createProfile(@RequestBody ProfileCreateForm profileCreateForm) {
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080").path("/profile/id")
                .build()
                .toUri();

        System.out.println(profileCreateForm.getName());
        System.out.println(profileCreateForm.getAge());
        System.out.println(profileCreateForm.getBirth());

        return ResponseEntity.created(url).body("profile successfully created");
    }

    @PatchMapping("/profile/{id}")
    public ResponseEntity<Map<String, String>> updateProfile(@PathVariable("id") int id, @RequestBody ProfileUpdateForm profileUpdateForm) {
        return ResponseEntity.ok(Map.of("message", "profile successfully updated"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProfile(@PathVariable("id") int id) {
        return ResponseEntity.ok("profile successfully deleted");
    }
}
