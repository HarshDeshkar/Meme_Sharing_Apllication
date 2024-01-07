package com.crio.starter.repository;

import java.util.List;
import com.crio.starter.dto.MemeDto;
import com.crio.starter.entity.MemeEntity;

public interface MemeRepositoryService {
    MemeDto postMeme(MemeEntity memeEntity);
    List<MemeDto> getMemes();
    MemeDto getMeme(String memeId);
}