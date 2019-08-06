<%--
  Created by IntelliJ IDEA.
  User: joannamardas
  Date: 2019-08-03
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Coordinates Converter</title>
</head>
<body>
    <h1>Convert coordinates</h1>

    <form action="convert" method="post">
        <input type="hidden" name="submitted" value="true">
        Input Path <br><input type="text" name="inputPath"> <br>
        Outputh Path <br><input type="text" name="outputPath"> <br>
        DDtoDMS <input type="radio" name="coordinatesFormat" value="DDtoDMS" checked>
        <br />
        DMStoDD <input type="radio" name="coordinatesFormat" value="DMStoDD">
        <br><input type="submit" name="convert" value="convert">



<%--        <input type="hidden" id="MAX_FILE_SIZE" name="MAX_FILE_SIZE" value="300000" />--%>

<%--        <div>--%>
<%--            <label for="fileselect">Files to upload:</label>--%>
<%--            <input type="file" id="fileselect" name="fileselect[]" multiple="multiple" />--%>
<%--            <div id="filedrag">or drop files here</div>--%>
<%--        </div>--%>

<%--        <div id="submitbutton">--%>
<%--            <input type="submit" name="uploadFile">Upload Files</input>--%>
<%--        </div>--%>
    </form>

<%--    <form>--%>
<%--        <div class="file-upload-wrapper">--%>
<%--            <input type="file" name="fileUpload" id="input-file-now" class="file-upload" >--%>
<%--            <input type="submit" name="uploadFile" value="uploadFile">--%>
<%--        </div>--%>

    </form>
</body>
</html>
