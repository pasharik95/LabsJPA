ALTER TABLE car DROP FOREIGN KEY FK_car_COLOROFCAR_ID
ALTER TABLE car DROP FOREIGN KEY FK_car_CLIENT_ID
ALTER TABLE car DROP FOREIGN KEY FK_car_MODELOFCAR_ID
ALTER TABLE detail DROP FOREIGN KEY FK_detail_STANDARTDETAIL_ID
ALTER TABLE detail DROP FOREIGN KEY FK_detail_CAR_ID
ALTER TABLE modelofcar DROP FOREIGN KEY FK_modelofcar_MARKOFCAR_ID
ALTER TABLE ordr DROP FOREIGN KEY FK_ordr_CAR_ID
ALTER TABLE ordr DROP FOREIGN KEY FK_ordr_WORKER_ID
ALTER TABLE process DROP FOREIGN KEY FK_process_ORDER_ID
ALTER TABLE process DROP FOREIGN KEY FK_process_WORKER_ID
ALTER TABLE process DROP FOREIGN KEY FK_process_OPERATION_ID
ALTER TABLE process_has_detail DROP FOREIGN KEY FK_process_has_detail_DETAIL_ID
ALTER TABLE process_has_detail DROP FOREIGN KEY FK_process_has_detail_PROCESS_ID
ALTER TABLE markofcar_modelofcar DROP FOREIGN KEY FK_markofcar_modelofcar_MarkOfCar_ID
ALTER TABLE markofcar_modelofcar DROP FOREIGN KEY FK_markofcar_modelofcar_models_ID
ALTER TABLE standartdetail_detail DROP FOREIGN KEY FK_standartdetail_detail_details_ID
ALTER TABLE standartdetail_detail DROP FOREIGN KEY FK_standartdetail_detail_StandartDetail_ID
DROP TABLE car
DROP TABLE colorofcar
DROP TABLE client
DROP TABLE detail
DROP TABLE markofcar
DROP TABLE modelofcar
DROP TABLE operation
DROP TABLE ordr
DROP TABLE process
DROP TABLE process_has_detail
DROP TABLE standartdetail
DROP TABLE worker
DROP TABLE markofcar_modelofcar
DROP TABLE standartdetail_detail
