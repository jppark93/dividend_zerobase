package zerobase.dividend.model;

import lombok.Data;
import zerobase.dividend.persist.entity.MemberEntity;

import java.util.List;


public class Auth {

    @Data
    public static class signIn{
        private String username;
        private String password;
    }

    @Data
    public static class signUp{

        private String username;
        private String password;
        private List<String> roles;

        public MemberEntity toEntity(){
            return MemberEntity.builder()
                    .username(this.username)
                    .password(this.password)
                    .roles(this.roles)
                    .build();
        }
    }
}