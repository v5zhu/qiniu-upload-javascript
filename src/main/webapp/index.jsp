<html>
<title>
    Qiniu Upload Plugin
</title>
<head>
    <script src="/node_modules/plupload/plupload.min.js" type="text/javascript"/>
    <script src="/node_modules/qiniu-js/dist/qiniu.min.js" type="text/javascript"/>
    <script src="/node_modules/jquery/dist/jquery.min.js" type="text/javascript"/>
    <script src="/js/mian.js" type="text/javascript"/>
</head>
<body>
<h2>Qiniu Upload Plugin</h2>
<div class="">
    <div class="text-left col-md-12 wrapper">
        <input type="hidden" id="domain" value="http://og2825geo.bkt.clouddn.com/">
        <input type="hidden" id="uptoken_url" value="${ctx}/container/uptoken">
    </div>
    <div class="body">
        <div>
            <div id="container">
                <a class="btn btn-default btn-md " id="pickfiles">
                    <i class="glyphicon glyphicon-plus"></i>
                    <sapn>上传文件</sapn>
                </a>

                <div id="html5_197igj75aami1c13vhi9rf1n9v3_container"
                     class="moxie-shim moxie-shim-html5"
                     style="position: absolute; top: 0px; left: 0px; width: 167px; height: 45px; overflow: hidden; z-index: 0;">
                    <input id="html5_197igj75aami1c13vhi9rf1n9v3" type="file"
                           style="font-size: 999px; opacity: 0; position: absolute; top: 0px; left: 0px; width: 100%; height: 100%;"
                           multiple="" accept="">
                </div>
            </div>
        </div>

        <div style="display:none" id="success" class="col-md-12">
            <div class="alert-success">
                队列全部文件处理完毕
            </div>
        </div>
        <div class="col-md-12 ">
            <table class="table table-striped table-hover text-left"
                   style="margin-top:40px;display:none">
                <thead>
                <tr>
                    <th class="col-md-4">文件名</th>
                    <th class="col-md-2">大小</th>
                    <th class="col-md-6">详情</th>
                </tr>
                </thead>
                <tbody id="fsUploadProgress">
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
