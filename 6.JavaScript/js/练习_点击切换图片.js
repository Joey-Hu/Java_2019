var img1 = document.getElementById("img1");

var flag = false;

function fun() {
	if (flag) {
		img1.src = "./img/image2.jpg";
		flag = false;
	} else {
		img1.src = "./img/image1.jpg";
		flag = true;
	}
	
}

img1.onclick = fun;