package main

import (
	"backend/dao"
	"backend/models"
	"backend/routers"
)

func main() {
	//数据库配置
	err := dao.InitMySQL()
	if err != nil {
		panic(err)
	}
	dao.DB.AutoMigrate(&models.List{})

	r := routers.SetupRouter()
	r.Run(":9090")
}
