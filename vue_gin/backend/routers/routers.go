package routers

import (
	"backend/controller"
	"backend/middlewares"

	"github.com/gin-gonic/gin"
)

func SetupRouter() *gin.Engine {
	r := gin.Default()
	r.Use(middlewares.Cors())
	r.GET("/", controller.IndexHandler)

	r.POST("/data", controller.SaveData)
	return r
}
