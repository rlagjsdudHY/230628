package com.shop.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.shop.constant.ItemSellStatus;

import lombok.Data;

@Entity
@Table(name = "item")
@Data
public class Item {

	@Id
	@Column(name = "item_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; // 상품코드

	@Column(nullable = false, length = 50)
	private String itemNm; // 상품명

	@Column(name = "price", nullable = false)
	private int price; // 가격
	@Column(nullable = false)
	private int stockNumber; // 재고
	@Lob
	@Column(nullable = false)
	private String itemDetail; // 제품 상세 설명
	@Enumerated(EnumType.STRING)
	private ItemSellStatus itemSellStatus; // 상품 판매 상태
	private LocalDateTime regTime; // 등록 시간
	private LocalDateTime updateTime; // 수정 시간
}