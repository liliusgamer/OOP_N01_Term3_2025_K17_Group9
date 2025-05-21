![image](https://github.com/user-attachments/assets/c266ed67-506c-4e79-92d8-d5d970d4d847)# Group9
I - Tiêu đề
Thiết kế và phát triển Game 2D Phiêu lưu: Lạc Trong Rừng Cấm


II - Đối tượng
- Nhân vật chính (Main Character / Player):
Vai trò: Là đối tượng điều khiển chính trong game, do người chơi điều khiển để di chuyển, nhảy, chiến đấu và tương tác với môi trường.
Thuộc tính: Vị trí, tốc độ di chuyển, máu (HP), trạng thái (đang đứng, tấn công...), hoạt ảnh (animation).
Hành vi: Di chuyển trái/phải, tấn công, nhận sát thương, tương tác với vật phẩm hoặc NPC.

 Sơ đồ Behavioural Diagram-Sequence Diagram — Hành vi Nhân vật chính (Player):
 ![Sequence Diagram Hành vi Nhân vật chính (Player)](https://github.com/user-attachments/assets/c94e5512-3f82-4b44-8dfd-76625a01c7ab)


- Kẻ thù (Enemy):
Vai trò: Gây thử thách cho người chơi, tạo nên tính đối kháng và tăng độ khó.
Thuộc tính: Vị trí, sát thương, máu, phạm vi phát hiện người chơi, hoạt ảnh.
Hành vi: Tuần tra, đuổi theo người chơi, tấn công khi đến gần, chết khi hết máu.

Sơ đồ Behavioural Diagram- Activity Diagram — Hành vi Kẻ thù (Enemy):
![522d8907-ed9d-49c9-ae5a-c56d992e6aa7](https://github.com/user-attachments/assets/006a425b-e9e8-4d1f-b03c-5d0e8faa5d13)



- Vật phẩm (Item):
Vai trò: Hỗ trợ người chơi trong quá trình chơi game, tăng tính hấp dẫn và khám phá.
Thuộc tính: Loại vật phẩm (hồi máu, tăng tốc độ, chìa khóa...), vị trí, hiệu ứng khi nhặt.
Hành vi: Nằm cố định trên bản đồ, biến mất khi được nhặt, kích hoạt hiệu ứng hỗ trợ cho người chơi.

Sơ đồ Behavioural Diagram-Activity Diagram: Hành vi Kẻ thù (Enemy):
![tải xuống](https://github.com/user-attachments/assets/9dba6ec5-13e2-4adb-9b64-fbb91475060c)



III - Cấu trúc Folder.

Gồm có 2 folder: scr (source code), res (resource).

Trong scr gồm có các lớp:
- characters: Class cho nhân vật, kẻ thù
- items: Class cho vật phẩm
- tests: Kiểm định
- Main: Lớp chính để chạy game

Trong res gồm có:
- images: hình ảnh
- sounds: âm thanh
- maps: bản đồ

IV - P4
1. Giao diện:
Sử dụng Java Spring Boot với Thymeleaf hoặc REST API + Swagger/Postman để thao tác CRUD.

2. Chức năng quản lý nhân vật (Đối tượng 01: Character)
Thêm, sửa, xoá nhân vật (tên, level, HP, MP, class như "warrior", "mage")

Liệt kê danh sách nhân vật

Lọc theo class, level, giới tính...

3. Chức năng quản lý bản đồ (Đối tượng 02: Map)
Thêm, sửa, xoá bản đồ (tên map, loại map: rừng, hang động, thành phố)

Gán nhân vật cho bản đồ (nhân vật đang ở đâu)

4. Chức năng quản lý nhiệm vụ (Đối tượng 03: Quest)
Thêm, sửa, xoá nhiệm vụ (tiêu đề, mô tả, phần thưởng)

Gán nhiệm vụ cho nhân vật

5. Chức năng mở rộng (tuỳ chọn):
Tìm nhân vật có level cao nhất

Thống kê số nhân vật trên từng bản đồ

Xuất dữ liệu sang JSON hoặc file CSV

Lưu checkpoint (bản đồ + nhiệm vụ + trạng thái nhân vật)


**CLASS DIAGRAM**
![image](https://github.com/user-attachments/assets/68b6fc70-5e0b-4a1c-a9c4-efb157201752)


**BEHAVIOUR**
![image](https://github.com/user-attachments/assets/c5dd29c4-d28f-420c-b83f-898f73b549a8)
![image](https://github.com/user-attachments/assets/748f6d2d-51d5-4fa9-8a2d-ec5c6486496a)
![image](https://github.com/user-attachments/assets/798d4714-876f-4c1d-8de6-015ce37a52c1)




