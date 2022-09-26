---
toc: true
layout: post
title: Javascript Practice
description: Javascript Woo
permalink: /week5/js-table
---

# Javascript Practice
- Using Javascript along with JSON

<br>
<input id="value1" type="text" placeholder="Say Something">
<button id="enter" type="submit" onclick="enter()">Enter Value</button>
<table id="mainTable">
    <tr>
        <th> Your Words </th>
    </tr>
</table>
<br>

<script>
    var yes = document.getElementById("value1");

    var mainTable = document.getElementById("mainTable");
    var rawTable = document.getElementById("rawJSON");

    yes.addEventListener('keyup', function(event) {
        if (event.keyCode === 13) {
            event.preventDefault();
            document.getElementById("enter").click();
        }
    var counter = 0
    var body = []
    var list = "";
    function enterterm() {
            var temp = {id: counter, name: yes.value};
            counter++;
            body.push(temp);
            appendTable(temp);
            jsonval = JSON.stringify(body);
            rawTable.innerHTML = jsonval;
        }
    function appendTable(row) {
        var trdiv = document.createElement("tr");
        var td1 = document.createElement("td"); td1.innerHTML = row["id"]; trdiv.appendChild(td1);
        mainTable.appendChild(trdiv);
    }
</script>