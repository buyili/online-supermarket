package com.buyi.commons.util;

import com.buyi.constant.ResponseStatusEnum;
import com.buyi.exception.GlobalException;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by 1132989278@qq.com on 2018/11/30 10:14
 */
public class UploadUtil {

    private static String LOGO_ROOT_PATH = "E:\\BadLife\\ProjectRepository\\online-supermarket\\src\\main\\resources\\static\\logo/";

    public static String saveLogo(MultipartFile file, String logoName) throws IOException {
        String newFileName = file.getOriginalFilename()
                .replaceFirst(".*\\.", System.nanoTime() + logoName + ".");
        File newFile = new File(LOGO_ROOT_PATH + newFileName);
        file.transferTo(newFile);
        return newFileName;
    }
}
