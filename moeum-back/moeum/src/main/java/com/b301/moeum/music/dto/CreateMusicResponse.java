package com.b301.moeum.music.dto;

import java.util.List;

public record CreateMusicResponse(
        List<String> musicUrls
) {
}