package controller

import (
	"net/http"

	"backend/models"

	"github.com/gin-gonic/gin"
)

func IndexHandler(c *gin.Context) {
	lists, err := models.GetAllList()
	if err != nil {
		c.JSON(http.StatusOK, gin.H{
			"error": err.Error(),
		})
	} else {
		c.JSON(http.StatusOK, lists)
	}
}

func SaveData(c *gin.Context) {
	var list models.List
	c.BindJSON(&list)

	c.JSON(http.StatusOK, gin.H{
		"code": http.StatusOK,
		"data": list.Name,
	})

	models.CreateAList(&list)

}
