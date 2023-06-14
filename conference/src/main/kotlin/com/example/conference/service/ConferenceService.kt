package com.example.conference.service

import com.example.conference.model.Conference
import com.example.conference.repository.ConferenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class ConferenceService {

    @Autowired
    lateinit var conferenceRepository: ConferenceRepository

    fun list(): List<Conference>{
        return conferenceRepository.findAll()
    }

    fun save(conference: Conference):Conference{
        return conferenceRepository.save(conference)
    }
}