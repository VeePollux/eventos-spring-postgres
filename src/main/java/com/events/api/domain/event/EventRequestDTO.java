package com.events.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(String title, String description, Long date, String city, String state, boolean remote, String eventUrl, MultipartFile image) {
}
