# TW-Theater

## 组员及任务分工

- 组员: 张林韬 & 张亦弛
- 任务分工: 

## API 需求分析

- 首页API

- 搜素页API

- 详情页API
    - 根据 `id` 返回电影详情数据
        ```
        localhost:8080/movie/{id} -> { # 电影详情对象
        "title": xxx, #电影名
        "ori-title": xxx, # 电影原名
        "year": xxx, # 电影上映年
        “genres": xxx, # 电影种类
        "directors": csv, # 电影导演
        "languages": csv, # 电影语言
        "casts": csv, # 电影演员
        "pubdates": 1998-06-05(美国),1998-06-06(中国) # 上映时间
        "videos": TODO, # 电影链接, 内容格式待确认
        "summary": text, # 内容简介
        "popular_reviews": {review_obj} # TODO 用户短评
        }
        ```
    - 查询从`id`起的`count`个数的电影详情数据
        ```
        localhost:8080/movies?start={id}&count={num} -> 
        [{电影详情对象}, {电影详情对象}] # json: list of objects
        ```