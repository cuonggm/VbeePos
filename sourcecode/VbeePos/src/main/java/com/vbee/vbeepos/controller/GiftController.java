package com.vbee.vbeepos.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vbee.vbeepos.bean.GiftInfo;
import com.vbee.vbeepos.model.HashTag;
import com.vbee.vbeepos.service.GiftService;
import com.vbee.vbeepos.service.HashTagService;

@Controller
@RequestMapping(value = "/gifts")
public class GiftController extends BaseController {

	@Autowired
	private HashTagService hashTagService;

	@Autowired
	private GiftService giftService;
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newz(Model model) {
		List<HashTag> hashTags = hashTagService.loadAll();
		model.addAttribute("hashTags", hashTags);
		return "gift-new";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String create(HttpSession session, @RequestParam String hashTag, @RequestParam Integer points,
			@RequestParam Long receiverId, @RequestParam String message, RedirectAttributes redirectAttributes) {
		Long senderId = getCurrentAccountId(session);
		try {
			giftService.createAndSave(senderId, receiverId, hashTag, points, message);
			redirectAttributes.addFlashAttribute("flash", "success");
			redirectAttributes.addFlashAttribute("message", "Sent gift!");
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("flash", "danger");
			redirectAttributes.addFlashAttribute("message", e.getMessage());

		}
		return "redirect:/gifts/new/";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list(Model model) {
		List<GiftInfo> giftList = giftService.loadAllGiftInfo();
		model.addAttribute("giftList", giftList);
		return "gift-list";
	}
}
