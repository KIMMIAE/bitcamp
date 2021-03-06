package java100.app.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.dao.DaoException;
import java100.app.dao.ScoreDao;
import java100.app.domain.Score;
import java100.app.util.DataSource;

// 기존에 있던 ScoreDao 클래스에서 컨트롤러가 호출하는 기본 메서드 
// 호출 규칙을 별도의 인터페이스로 분리하고,
// 이 클래스는 그 인터페이스를 구현한 클래스로 전환한다.
//
@Component 
public class ScoreDaoImpl implements ScoreDao {
    
    // 주입 받은 DataSource 객체를 저장할 인스턴스 변수를 준비한다.
    @Autowired
    DataSource ds;
    
    // 외부에서 DataSource 객체를 주입할 수 있도록 셋터를 준비한다.
    
    // DataSource를 주입 받았다 가정하고 다음 아래의 메서드들을 변경한다.
    // => 이렇게하면 DataSource를 얻기 위해 ApplicationContext를 사용한
    //    코드를 제거해도 된다. 
    // => 즉 더이상 ApplicationContext에 종속되지 않는다.
    //
    public List<Score> selectList() {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "select no,name,kor,eng,math from ex_score");
            rs = pstmt.executeQuery();
                 
            // ScoreController에게 성적 데이터를 리턴하기 위한 List 객체 준비.
            ArrayList<Score> list = new ArrayList<>();
            
            while (rs.next()) {
                Score score = new Score(
                        rs.getInt("no"),
                        rs.getString("name"),
                        rs.getInt("kor"),
                        rs.getInt("eng"),
                        rs.getInt("math"));
                
                list.add(score);
            }
            
            return list;
            
        } catch (Exception e) {
            throw new DaoException(e);
            
        } finally {
            try {rs.close();} catch (Exception e) {}
            try {pstmt.close();} catch (Exception e) {}
            ds.returnConnection(con);
        }
    }
    
    public int insert(Score score) {
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "insert into ex_score(name,kor,eng,math) values(?,?,?,?)");
            
            pstmt.setString(1, score.getName());
            pstmt.setInt(2, score.getKor());
            pstmt.setInt(3, score.getEng());
            pstmt.setInt(4, score.getMath());
            
            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            ds.returnConnection(con);
        }
    }
    
    public int update(Score score) {
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "update ex_score set name=?,kor=?,eng=?,math=? where no=?");
            pstmt.setString(1, score.getName());
            pstmt.setInt(2, score.getKor());
            pstmt.setInt(3, score.getEng());
            pstmt.setInt(4, score.getMath());
            pstmt.setInt(5, score.getNo());
            
            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            ds.returnConnection(con);
        }
    }
    
    public int delete(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "delete from ex_score where no=?");
            
            pstmt.setInt(1, no);
            
            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            ds.returnConnection(con);
        }
    }
    
    public Score selectOne(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            con = ds.getConnection();
            pstmt = con.prepareStatement(
                    "select no,name,kor,eng,math from ex_score where no=?");
            
            pstmt.setInt(1, no);
            
            rs = pstmt.executeQuery();
            
            Score score = null;
            
            if (rs.next()) {
                score = new Score();
                score.setNo(no);
                score.setName(rs.getString("name"));
                score.setKor(rs.getInt("kor"));
                score.setEng(rs.getInt("eng"));
                score.setMath(rs.getInt("math"));
            } 
            
            return score;
            
        } catch (Exception e) {
            throw new DaoException(e);
        } finally {
            try {rs.close();} catch (Exception e) {}
            try {pstmt.close();} catch (Exception e) {}
            ds.returnConnection(con);
        }
    }
}















