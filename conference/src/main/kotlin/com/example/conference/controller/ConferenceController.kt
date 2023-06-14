package com.example.conference.controller

import com.example.conference.model.Conference
import com.example.conference.service.ConferenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/conference")

class ConferenceController {

    @Autowired
    lateinit var conferenceService: ConferenceService

    @GetMapping
    fun list():List<Conference>{
        return conferenceService.list()
    }

    @PostMapping
    fun save (@RequestBody conference: Conference):Conference?{
        return conferenceService.save(conference)
    }

}