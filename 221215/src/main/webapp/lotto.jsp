<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>lotto</title>
		<style>
			.num-box {
				display: table-cell;
				width: 100px;
				height: 100px;
				border: 1px solid gray;
				text-align: center;
				vertical-align: middle;
				font-size: 40px;
				color: white;
			}
			.red {
				background-color: red;
			}
			.orange {
				background-color: orange;
			}
			.yellow {
				background-color: yellow;
			}
			.green {
				background-color: green;
			}
			.blue {
				background-color: blue;
			}
			.purple {
				background-color: purple;
			}
			
		</style>
	</head>
	<body>
		<div>
			<div id="num1" class="num-box red"></div>
			<div id="num2" class="num-box orange"></div>
			<div id="num3" class="num-box yellow"></div>
			<div id="num4" class="num-box green"></div>
			<div id="num5" class="num-box blue"></div>
			<div id="num6" class="num-box purple"></div>
		</div>
		<script>
			// 배열 생성 방법
			// let a = []; // 배열 리터럴을 이용하는 방법
			// console.log(typeof(a));
			// let b = new Array(); // 배열 생성자 함수를 사용하는 방법
			// console.log(typeof(b));
			
			// 1) 코어 알고리즘 -> 서버기술(자바로 구현)
			let ball = new Array(45);
			// 초기화
			for(let i=0; i<ball.length; i++) {
				ball[i] = i+1;
			}
			// console.log('초기화 : ', ball);
			
			// 섞기
			for(let i=0; i<100000; i++) {
				let temp = ball[0];
				let rNum = Math.floor(Math.random() * ball.length) // 0 ~ 44
				ball[0] = ball[rNum];
				ball[rNum] = temp;
			}
			console.log('shuffle : ', ball);
			
			let result = ball.slice(0, 6); // 값 1자리부터 값 2자리 앞까지 반환 0,1,2,3,4,5 인덱스 반환한 배열
			console.log('result : ', result);
			
			// 2) 출력 알고리즘
			// setTimeout(함수, 시간ms) : 시간ms 후에 함수를 실행
			setTimeout(function() {
				document.querySelector('#num1').innerHTML = result[0];
			}, 1000);
			setTimeout(function() {
				document.querySelector('#num2').innerHTML = result[1];
			}, 2000);
			setTimeout(function() {
				document.querySelector('#num3').innerHTML = result[2];
			}, 3000);
			setTimeout(function() {
				document.querySelector('#num4').innerHTML = result[3];
			}, 4000);
			setTimeout(function() {
				document.querySelector('#num5').innerHTML = result[4];
			}, 5000);
			setTimeout(function() {
				document.querySelector('#num6').innerHTML = result[5];
			}, 6000);
			
		</script>
	</body>
</html>