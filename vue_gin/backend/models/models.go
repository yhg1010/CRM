package models

import (
	"backend/dao"
)

type List struct {
	ID   int    `json:"id"`
	Male string `json:"male"`
	Name string `json:"name"`
}

func CreateAList(list *List) (err error) {
	if dao.DB.Create(&list).Error != nil {
		return err
	}
	return
}

func GetAllList() (lists []*List, err error) {
	if err := dao.DB.Find(&lists).Error; err != nil {
		return nil, err
	}
	return
}
