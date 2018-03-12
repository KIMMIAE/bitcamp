var formDataItem = $('#formData'),
    addBtn = $('#addBtn'),
    cuttingBtn = $('#cuttingBtn'),
    
    /* input의 id 변수들 */
    
    noItem = $('#no'),
    emailItem = $('#email'),
    passwordItem = $('#password'),
    pwConfirmItem = $('#pwConfirm'),
    nickNameItem = $('#nickName'),
    messageFlag1Item = $('#messageFlag1'),
    messageFlag2Item = $('#messageFlag2'),
    messageIdItem = $('#messageId'),
    type1Item = $("#type1"),
    type2Item = $("#type2"),
    artistNameItem = $('#artistName'),
    artistMemberItem = $('#artistMember'),
    profileItem = $('#profile'),
    joinDateItem = $('#joinDate'),
    areasDivItem = $('#areasDiv'),
    genresDivItem = $('#genresDiv'),
    
    imageCropperItem = $('#image-cropper'),
    hiddenImageDate = $('#hidden-image-data'),
    
    /* check div들에 문구를 출력해줄 변수들 */
    
    chkEmailMsgItem = $('#chkEmailMsg'),
    chkPwMsgItem = $('#chkPwMsg'),
    chkNickMsgItem = $('#chkNickMsg'),
    chkMessageIdItem = $('#chkMessageId'),
    chkArtistNameItem = $('#chkArtistName'),
    chkArtistMemberItem = $('#chkArtistMember'),
    chkProfileItem = $('#chkProfile'),
    chkJoinDateItem = $('#chkJoinDate'),
    chkAreasItem = $('#chkAreas'),
    chkGenresItem = $('#chkGenres'),
    
    chkImageItem = $('#chkImageMsg'),
    
    /* 검증용 변수 */
    
    emailCount = null,
    nickNameCount = null,
    conPw = null,
    completConfirm = null;

$('footer').load('../footer.html');

imageCropperItem.cropit({
    imageBackground:true, 
    imageBackgroundBorderWidth: 15,
    allowDragNDrop:true,
    imageState: { src: "../images/dragNdrop.jpg" }
});

cuttingBtn.click(function(){
    var imageData = imageCropperItem.cropit('export', {
        type: 'image/jpeg',
        quality: .9,
        originalSize: true
    });
    
    hiddenImageDate.val(imageData);
    
    if (hiddenImageDate.val() != "") {
        chkImageItem.html('<p class="checkMessages" id="cutPhoto">사진 편집이 완료 되었습니다.</p>')
    }
});

$("#messageFlag1").click(function(){
    $("#messageIdDiv").show();
});
    
$("#messageFlag2").click(function(){
    $("#messageIdDiv").hide();
});

$("#artistInfoDiv").hide();

$("#type1").click(function(){
    $("#artistInfoDiv").hide();
});

$("#type2").click(function(){
    $("#artistInfoDiv").show();
});




var index = location.href.indexOf('?');

if (index != -1) {

window.alert("잘못된 요청입니다.");

location.href='form.html';

}

var re_email = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
var re_password = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{6,18}/;
var re_nickName = /^[\w\Wㄱ-ㅎㅏ-ㅣ가-힣]{2,10}$/;

function checkEmail() {
    $.ajax({
        url: '../json/member/checkEmail',
        type: 'post',
        data: {
            email: emailItem.val()
        },
        success: function (count) {
            if (count == 0 && re_email.test(emailItem.val()) == true) {
            	chkEmailMsgItem.html('<p class="checkMessages" style="color:blue;">사용 가능한 이메일입니다.</p>');
            	emailCount = count;
                return emailCount;
            } else if (re_email.test(emailItem.val()) == false) {
                chkEmailMsgItem.html('<p class="checkMessages" style="color:red;">이메일 형식이 맞지 않습니다.</p>');
                emailCount = count;
                return emailCount;
            } else if (count == 1) {
            	chkEmailMsgItem.html('<p class="checkMessages" style="color:red;">이미 가입한 이메일입니다.</p>');
                emailCount = count;
                return emailCount;
            } 
        },
        error: function () {
            alert("이메일 체크 중 서버 에러");
        }
    });
};



function checkPassword() {
    if (re_password.test(passwordItem.val()) == true) {
        chkPwMsgItem.html('<p class="checkMessages" style="color:blue;">사용 가능한 비밀번호입니다.</p>');
        conPw = true;
        return conPw;
    } else if (re_password.test(passwordItem.val()) == false) {
        chkPwMsgItem.html('<p class="checkMessages" style="color:red;">비밀번호는 영문/숫자/특수문자 조합 6~18자입니다.</p>');
        conPw = false;
        return conPw;
    } 
};

function confirmPassword() {
    if (passwordItem.val() == pwConfirmItem.val() && conPw == true) {
        chkPwMsgItem.html('<p class="checkMessages" style="color:blue;">비밀번호 확인 일치!</p>');
        completConfirm = true;
        return completConfirm;
    } else if (re_password.test(pwConfirmItem.val()) == false) {
        chkPwMsgItem.html('<p class="checkMessages" style="color:red;">비밀번호는 영문/숫자/특수문자 조합 6~18자입니다.</p>');
        completConfirm = false;
        return completConfirm;
    } else {
        chkPwMsgItem.html('<p class="checkMessages" style="color:red;">비밀번호 확인 불일치!</p>');
        completConfirm = false;
        return completConfirm;
    }
};

function checkNickName() {
    $.ajax({
        url: '../json/member/checkNickName',
        type: 'post',
        data: {
            nickName: nickNameItem.val()
        },
        success: function (count) {
            if (count == 0 && re_nickName.test(nickNameItem.val()) == true) {
                chkNickMsgItem.html('<p class="checkMessages" style="color:blue;">사용 가능한 닉네임입니다.</p>');
                nickNameCount = count;
                return nickNameCount;
            } else if (re_nickName.test(nickNameItem.val()) == false) {
                chkNickMsgItem.html('<p class="checkMessages" style="color:red;">닉네임 형식이 맞지 않습니다.</p>');
                nickNameCount = count;
                return nickNameCount;
            } else if (count == 1) {
                chkNickMsgItem.html('<p class="checkMessages" style="color:red;">이미 등록된 닉네임입니다.</p>');
                nickNameCount = count;
                return nickNameCount;
            }
        },
        error: function () {
            alert("닉네임 체크 중 서버 에러");
        }
    });
};

function pad(n, width) {
    n = n + '';
    return n.length >= width ? n : new Array(width - n.length + 1).join('0') + n;
}


addBtn.click(() => {

// 이메일 검증
if (emailItem.val() == "") {
    chkEmailMsgItem.html('<p class="checkMessages" style="color:red;">이메일을 입력해주세요.</p>');
    emailItem.focus();
    return;
}

if (re_email.test(emailItem.val()) == false || emailCount == 1) {
    emailItem.focus();
    return;
}



// 닉네임 검사
if (nickNameItem.val() == "") {
    chkNickMsgItem.html('<p class="checkMessages" style="color:red;">닉네임을 입력해 주세요.</p>');
    nickNameItem.focus();
    return;
} else if (re_nickName.test(nickNameItem.val()) == false) {
	nickNameItem.focus();
    return;
} else if (nickNameCount == 1) {
    nickNameItem.focus();
    return;
}

//비밀번호 검사
if (passwordItem.val() == "") {
    chkPwMsgItem.html('<p class="checkMessages" style="color:red;">비밀번호를 입력해 주세요.</p>');
    pwConfirmItem.val("");
    passwordItem.focus();
    return;
} else if (re_password.test(passwordItem.val()) == false) {
    passwordItem.focus();
    return;
} else if (completConfirm == false) {
	pwConfirmItem.focus();
    return;
} else if (pwConfirmItem.val() == "") {
    chkPwMsgItem.html('<p class="checkMessages" style="color:red;">비밀번호 확인을 입력해 주세요.</p>');
    pwConfirmItem.focus();
    return;
} 

// 메시지 수신 동의 시 아이디 입력 확인
if ($("input[name='messageFlag']:checked").val() == 
        '1' && messageIdItem.val() == "") {
    chkMessageIdItem.html('<p class="checkMessages" style="color:red;">메세지를 수신 받을 카카오톡 ID를 입력해주세요.</p>');
	messageIdItem.focus();
   return;
} 

// 아티스트 입력 항목 검사
if ($("input[name='type']:checked").val() == '아티스트') {
    if (artistNameItem.val() == "") {
        chkArtistNameItem.html('<p class="checkMessages" style="color:red;">활동명을 입력해주세요.</p>');
        artistNameItem.focus();
        return;
    } else if (artistMemberItem.val() == "") {
    	chkArtistMemberItem.html('<p class="checkMessages" style="color:red;">팀 구성원을 입력해주세요.</p>');
    	artistMemberItem.focus();
    	return;
    } else if (profileItem.val() == "") {
    	chkProfileItem.html('<p class="checkMessages" style="color:red;">프로필을 입력해주세요.</p>');
    	profileItem.focus();
    	return;
    } else if (joinDateItem.val() == "") {
    	chkJoinDateItem.html('<p class="checkMessages" style="color:red;">팀 결성일을 입력해주세요!</p>');
    	joinDateItem.focus();
    	return;
    }
}

// 관심 장르와 지역 반드시 입력
if ($("input[name='areas']:checked").val() == null) {
	chkAreasItem.html("관심 장르를 체크해주세요");
	areasDivItem.focus();
   return;
}

if ($("input[name='genres']:checked").val() == null) {
	chkGenresItem.html("관심 지역을 체크해주세요.");
	genresDivItem.focus();
   return;
}

var formData = new FormData(formDataItem[0]);
	
	if (joinDateItem.val() != "") {
		formData.append("artist.joinDate", joinDateItem.val() + " 00:00");
	}
	
    $.ajax('../json/member/add', {
        data: formData,
        dataType: 'json',
        method: 'POST',
        processData: false,
        contentType: false,
        success: () => {
            location.href='../index.html';
        },
        error: () => {
            alert("서버 입력 오류!");
        }
    });
});
