package org.example.spring_boot;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@ConfigurationProperties(prefix="app")
@Component
public class AppConfig {
    private File file;

    public File getFile(){
        return file;
    }
    public void setFile(File file){
        this.file = file;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "file=" + file +
                '}';
    }

    public static class File{
        private  String uploadDir;
        private String maxSize;

        public String getUploadDir() {
            return uploadDir;
        }

        public void setUploadDir(String uploadDir) {
            this.uploadDir = uploadDir;
        }

        public String getMaxSize() {
            return maxSize;
        }

        public void setMaxSize(String maxSize) {
            this.maxSize = maxSize;
        }

        public String showValues(){
            return "values are: "+uploadDir +" maxsize :"+maxSize;
        }

    }




}
