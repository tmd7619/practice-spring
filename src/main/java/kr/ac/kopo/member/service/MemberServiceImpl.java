package kr.ac.kopo.member.service;

import kr.ac.kopo.member.dao.MemberDAO;
import kr.ac.kopo.member.vo.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberDAO memberDAO;

    public MemberServiceImpl(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public MemberVO login(MemberVO memberVO) {

        MemberVO userVO = memberDAO.login(memberVO);

        if (userVO == null) {
            System.out.println("DAO 에서 정상적인 userVO 값을 가져오지 못했습니다.");

        }

        return userVO;

    }
}
