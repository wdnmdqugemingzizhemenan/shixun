$("#back").on("click",function (){
    if(referer != undefined
        && null != referer
        && "" != referer
        && "null" != referer
        && referer.length >4) {
        window.location.href = referer;
    }else {
        history.back(-1);
    }
});