/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.contenttargeting.reports.campaigntrackingaction.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for CampaignTrackingAction. This utility wraps
 * {@link com.liferay.contenttargeting.reports.campaigntrackingaction.service.impl.CampaignTrackingActionServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CampaignTrackingActionService
 * @see com.liferay.contenttargeting.reports.campaigntrackingaction.service.base.CampaignTrackingActionServiceBaseImpl
 * @see com.liferay.contenttargeting.reports.campaigntrackingaction.service.impl.CampaignTrackingActionServiceImpl
 * @generated
 */
@ProviderType
public class CampaignTrackingActionServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.contenttargeting.reports.campaigntrackingaction.service.impl.CampaignTrackingActionServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static CampaignTrackingActionService getService() {
		if (_service == null) {
			_service = (CampaignTrackingActionService)PortalBeanLocatorUtil.locate(CampaignTrackingActionService.class.getName());

			ReferenceRegistry.registerReference(CampaignTrackingActionServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CampaignTrackingActionService service) {
	}

	private static CampaignTrackingActionService _service;
}