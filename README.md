# raiseTech-course-task7

REST APIのサンプルプロジェクトです。  
Controllerのみ実装しています。

# 起動手順

IntelliJでの起動を想定しています。  
PetrestapiApplication.javaを開いてアプリケーションを起動してください。

# シェルスクリプト

シェルスクリプトを用いてAPIの動作確認をします。  

すでに動作確認用のシェルスクリプトは作成済みです。

ターミナルを開いて下記コマンドを実行してください。
```sh
$ sh restapi-test.sh
```

下記のような実行結果が得られればOKです。

```sh
% sh restapi-test.sh
GET プロフィール取得
HTTP/1.1 200
Content-Type: application/json
Transfer-Encoding: chunked
Date: Sat, 24 Jun 2023 08:53:12 GMT

["ALBA","VANILLA"]

===========
POST プロフィール登録
HTTP/1.1 201
Location: http://localhost:8080/profile/id
Content-Type: text/plain;charset=UTF-8
Content-Length: 28
Date: Sat, 24 Jun 2023 08:53:12 GMT

profile successfully created

===========
PATCH プロフィール更新
HTTP/1.1 200
Content-Type: application/json
Transfer-Encoding: chunked
Date: Sat, 24 Jun 2023 08:53:12 GMT

{"message":"profile successfully updated"}

===========
DELETE プロフィール削除
HTTP/1.1 200
Content-Type: text/plain;charset=UTF-8
Content-Length: 28
Date: Sat, 24 Jun 2023 08:53:12 GMT

profile successfully deleted%
```
