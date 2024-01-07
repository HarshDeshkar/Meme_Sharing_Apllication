package com.crio.starter.service;


import java.util.List;
import com.crio.starter.dto.MemeDto;
import com.crio.starter.entity.MemeCreated;
import com.crio.starter.entity.MemeEntity;

public interface MemeService {
    MemeCreated postMeme(MemeEntity memeEntity);
    List<MemeDto> getMemes();
    MemeDto getMeme(String memeId);
}